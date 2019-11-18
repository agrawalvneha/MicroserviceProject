package com.crts.app.magna.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.crts.app.magna.main.dto.BranchMasterDTO;
import com.crts.app.magna.main.dto.BranchMasterDtoFetch;
import com.crts.app.magna.main.dto.BranchTypeMasterDtoFetch;
import com.crts.app.magna.main.dto.CustomerCibilDetailsDto;
import com.crts.app.magna.main.dto.CustomerCibilDetailsDtoFetch;
import com.crts.app.magna.main.dto.DealerMasterDto;
import com.crts.app.magna.main.dto.DealerMasterDtoFetch;
import com.crts.app.magna.main.dto.DistrictMasterDtoFetch;
import com.crts.app.magna.main.dto.EnquiryDetailsDto;
import com.crts.app.magna.main.dto.EnquiryDetailsDtoFetch;
import com.crts.app.magna.main.dto.EnquiryStatusTraceDtoFetch;
import com.crts.app.magna.main.dto.LoanTypeDto;
import com.crts.app.magna.main.dto.LoanTypeDtoFetch;
import com.crts.app.magna.main.dto.RoleMasterDtoFetch;
import com.crts.app.magna.main.dto.StateMasterDtoFetch;
import com.crts.app.magna.main.dto.StatusMasterDtoFetch;
import com.crts.app.magna.main.dto.SubDealerMasterDto;
import com.crts.app.magna.main.dto.SubDealerMasterDtoFetch;
import com.crts.app.magna.main.dto.UserMasterDto;
import com.crts.app.magna.main.dto.UserMasterDtoFetch;
import com.crts.app.magna.main.dto.VenderDetailsDtoFetch;
import com.crts.app.magna.main.dto.VendorDetailsDto;
import com.crts.app.magna.main.service.HomeServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HomeController {

	@Autowired
	private HomeServiceI si;
	
	@RequestMapping(value = "saveVendor", consumes = "application/json", method = RequestMethod.POST)
	public void saveVendor(@RequestBody VendorDetailsDto vdd)
	{
		System.out.println("inside Vendor Save of Controller");
		si.saveVendorData(vdd);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
	public void save(@RequestBody String object) throws JsonMappingException, JsonProcessingException {
		System.out.println("inside save of controller");
		ObjectMapper ob = new ObjectMapper();
		@SuppressWarnings("rawtypes")
		HashMap obb = ob.readValue(object, HashMap.class);
		System.out.println(obb.getClass().getName());
		@SuppressWarnings("unchecked")
		Set<String> set = obb.keySet();
		for (String s : set) {
			System.out.println(s);
//			if (s.equals("statusName")) {
//				StatusMasterDto obb1 = ob.readValue(object, StatusMasterDto.class);
//				System.out.println(obb1.getClass().getName());
//				si.savedata(obb1);
//			} else 
			if (s.equals("loanTypeName")) {
				LoanTypeDto obb1 = ob.readValue(object, LoanTypeDto.class);
				System.out.println(obb1.getClass().getName());
				si.savedata(obb1);
			} 
//			else if (s.equals("stateName")) {
//				StateMasterDto obb1 = ob.readValue(object, StateMasterDto.class);
//				System.out.println(obb1.getClass().getName());
//				si.savedata(obb1);
//			} else if (s.equals("districtName")) {
//				DistrictMasterDto obb1 = ob.readValue(object, DistrictMasterDto.class);
//				System.out.println(obb1.getClass().getName());
//				si.savedata(obb1);
//			} 
			else if (s.equals("dealerName")) {
				DealerMasterDto obb1 = ob.readValue(object, DealerMasterDto.class);
				System.out.println(obb1.getClass().getName());
				si.savedata(obb1);
			} else if (s.equals("subDealerName")) {
				SubDealerMasterDto obb1 = ob.readValue(object, SubDealerMasterDto.class);
				System.out.println(obb1.getClass().getName());
				si.savedata(obb1);
			} else if (s.equals("vendorName")) {
				VendorDetailsDto obb1 = ob.readValue(object, VendorDetailsDto.class);
				System.out.println(obb1.getClass().getName());
				si.savedata(obb1);
			} else if (s.equals("branchName")) {
				BranchMasterDTO obb1 = ob.readValue(object, BranchMasterDTO.class);
				System.out.println(obb1.getClass().getName());
				si.savedata(obb1);
			} 
//			else if (s.equals("branchTypeName")) {
//				BranchTypeMasterDto obb1 = ob.readValue(object, BranchTypeMasterDto.class);
//				System.out.println(obb1.getClass().getName());
//				si.savedata(obb1);
//			} 
//			else if (s.equals("roleName")) {
//				RoleMasterDto obb1 = ob.readValue(object, RoleMasterDto.class);
//				System.out.println(obb1.getClass().getName());
//				si.savedata(obb1);
//			} 
			else if (s.equals("userFirstName")) {
				UserMasterDto obb1 = ob.readValue(object, UserMasterDto.class);
				System.out.println(obb1.getClass().getName());
				si.savedata(obb1);
			} else if (s.equals("custFirstName")) {
				EnquiryDetailsDto obb1 = ob.readValue(object, EnquiryDetailsDto.class);
				System.out.println(obb1.getClass().getName());
				si.savedata(obb1);
			} else if (s.equals("cibilStatus")) {
				CustomerCibilDetailsDto obb1 = ob.readValue(object, CustomerCibilDetailsDto.class);
				System.out.println(obb1.getClass().getName());
				si.savedata(obb1);
			}
		}
	}

	@RequestMapping("/getStatusMaster")
	public List<StatusMasterDtoFetch> getStatusMaster() {
		return si.fetchStatusMaster();
	}

	@RequestMapping("/getBranchMaster")
	public List<BranchMasterDtoFetch> getBranchMaster() {
		return si.fetchBranchMaster();
	}

	@RequestMapping("/getBranchTypeMaster")
	public List<BranchTypeMasterDtoFetch> getBranchTypeMaster() {
		return si.fetchBranchTypeMaster();
	}

	@RequestMapping("/getCustomerCibilDetails")
	public List<CustomerCibilDetailsDtoFetch> getCustomerCibilDetails() {
		return si.fetchCustomerCibilDetails();
	}

	@RequestMapping("/getDealerMaster")
	public List<DealerMasterDtoFetch> getDealerMaster() {
		return si.fetchDealerMaster();
	}

	@RequestMapping("/getDistrictMaster")
	public List<DistrictMasterDtoFetch> getDistrictMaster() {
		return si.fetchDistrictMaster();
	}

	@RequestMapping("/getEnquiryDetails")
	public List<EnquiryDetailsDtoFetch> getEnquiryDetails() {
		return si.fetchEnquiryDetails();
	}

	@RequestMapping("/getLoanType")
	public List<LoanTypeDtoFetch> getLoanType() {
		return si.fetchLoanType();
	}

	@RequestMapping("/getStateMaster")
	public List<StateMasterDtoFetch> getStateMaster() {
		return si.fetchStateMaster();
	}

	@RequestMapping("/getSubDealerMaster")
	public List<SubDealerMasterDtoFetch> getSubDealerMaster() {
		return si.fetchSubDealerMaster();
	}

	@RequestMapping("/getVenderDetails")
	public List<VenderDetailsDtoFetch> getVenderDetails() {
		return si.fetchVenderDetails();
	}
	
	@RequestMapping("/getUserMaster")
	public List<UserMasterDtoFetch> getUserMaster() {
		return si.fetchUserMaster();
	}
	
	@RequestMapping("/getRoleMaster")
	public List<RoleMasterDtoFetch> getRoleMaster() {
		return si.fetchRoleMaster();
	}
	
	@RequestMapping("/getEnquiryStatusTraceMaster")
	public List<EnquiryStatusTraceDtoFetch> getEnquiryStatusTraceMaster() {
		return si.fetchEnquiryStatusTrace();
	}
}