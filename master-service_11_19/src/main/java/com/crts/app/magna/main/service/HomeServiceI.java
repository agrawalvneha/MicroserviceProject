package com.crts.app.magna.main.service;

import java.util.List;
import com.crts.app.magna.main.dto.BranchMasterDtoFetch;
import com.crts.app.magna.main.dto.BranchTypeMasterDtoFetch;
import com.crts.app.magna.main.dto.CustomerCibilDetailsDtoFetch;
import com.crts.app.magna.main.dto.DealerMasterDtoFetch;
import com.crts.app.magna.main.dto.DistrictMasterDtoFetch;
import com.crts.app.magna.main.dto.EnquiryDetailsDtoFetch;
import com.crts.app.magna.main.dto.EnquiryStatusTraceDtoFetch;
import com.crts.app.magna.main.dto.LoanTypeDtoFetch;
import com.crts.app.magna.main.dto.RoleMasterDtoFetch;
import com.crts.app.magna.main.dto.StateMasterDtoFetch;
import com.crts.app.magna.main.dto.StatusMasterDtoFetch;
import com.crts.app.magna.main.dto.SubDealerMasterDtoFetch;
import com.crts.app.magna.main.dto.UserMasterDtoFetch;
import com.crts.app.magna.main.dto.VenderDetailsDtoFetch;
import com.crts.app.magna.main.dto.VendorDetailsDto;

public interface HomeServiceI {
	public void savedata(Object o);
	
	public void saveVendorData(VendorDetailsDto vdd);

	public List<StatusMasterDtoFetch> fetchStatusMaster();

	public List<BranchMasterDtoFetch> fetchBranchMaster();

	public List<BranchTypeMasterDtoFetch> fetchBranchTypeMaster();

	public List<CustomerCibilDetailsDtoFetch> fetchCustomerCibilDetails();

	public List<DealerMasterDtoFetch> fetchDealerMaster();

	public List<DistrictMasterDtoFetch> fetchDistrictMaster();

	public List<EnquiryDetailsDtoFetch> fetchEnquiryDetails();

	public List<EnquiryStatusTraceDtoFetch> fetchEnquiryStatusTrace();

	public List<LoanTypeDtoFetch> fetchLoanType();

	public List<StateMasterDtoFetch> fetchStateMaster();

	public List<SubDealerMasterDtoFetch> fetchSubDealerMaster();

	public List<VenderDetailsDtoFetch> fetchVenderDetails();
	
	public List<RoleMasterDtoFetch> fetchRoleMaster();
	
	public List<UserMasterDtoFetch> fetchUserMaster();
}