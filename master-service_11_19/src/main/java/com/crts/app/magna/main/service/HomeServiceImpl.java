package com.crts.app.magna.main.service;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
import com.crts.app.magna.main.model.BranchMaster;
import com.crts.app.magna.main.model.BranchTypeMaster;
import com.crts.app.magna.main.model.CustomerCibilDetails;
import com.crts.app.magna.main.model.DealerMaster;
import com.crts.app.magna.main.model.DistrictMaster;
import com.crts.app.magna.main.model.EnquiryDetails;
import com.crts.app.magna.main.model.EnquiryStatusTrace;
import com.crts.app.magna.main.model.LoanType;
import com.crts.app.magna.main.model.RoleMaster;
import com.crts.app.magna.main.model.StateMaster;
import com.crts.app.magna.main.model.StatusMaster;
import com.crts.app.magna.main.model.SubDealerMaster;
import com.crts.app.magna.main.model.UserMaster;
import com.crts.app.magna.main.model.VendorDetails;
import com.crts.app.magna.main.repository.BranchRepository;
import com.crts.app.magna.main.repository.BranchTypeRepository;
import com.crts.app.magna.main.repository.CustomerCibilDetailsRepository;
import com.crts.app.magna.main.repository.DealerRepository;
import com.crts.app.magna.main.repository.DistrictRepository;
import com.crts.app.magna.main.repository.EnquiryDetailsRepository;
import com.crts.app.magna.main.repository.EnquiryStatusTraceRepository;
import com.crts.app.magna.main.repository.HomeRepositoryI;
import com.crts.app.magna.main.repository.LoanTypeRepository;
import com.crts.app.magna.main.repository.RoleRepository;
import com.crts.app.magna.main.repository.StateRepository;
import com.crts.app.magna.main.repository.SubDealerRepository;
import com.crts.app.magna.main.repository.UserRepository;
import com.crts.app.magna.main.repository.VendorRepository;

@Service
public class HomeServiceImpl implements HomeServiceI {
	@Autowired
	private HomeRepositoryI hri;

	@Autowired
	private LoanTypeRepository ltr;

	@Autowired
	private StateRepository sr;

	@Autowired
	private DistrictRepository dr;

	@Autowired
	private DealerRepository der;

	@Autowired
	private SubDealerRepository sder;

	@Autowired
	private VendorRepository vr;

	@Autowired
	private BranchRepository br;

	@Autowired
	private BranchTypeRepository btypr;

	@Autowired
	private RoleRepository rr;

	@Autowired
	private UserRepository ur;
	
	@Autowired
	private EnquiryDetailsRepository edr;
	
	@Autowired
	private CustomerCibilDetailsRepository ccdr;
	
	@Autowired
	private EnquiryStatusTraceRepository estr;
	
	@Override
	public void saveVendorData(VendorDetailsDto vdd) {
		System.out.println("inside Vendor Save of service");
		ModelMapper m = new ModelMapper();
		VendorDetails vd = m.map(vdd, VendorDetails.class);
		System.out.println("inside save of service Vendor type");
		vr.save(vd);
	}

	@Override
	public void savedata(Object o) {
		System.out.println("inside save of service");

//		if (o instanceof StatusMasterDto) {
//			ModelMapper m = new ModelMapper();
//			StatusMaster sm = m.map(o, StatusMaster.class);
//			System.out.println("inside save of service statusmaster");
//			hri.save(sm);
//		} else 
		if (o instanceof LoanTypeDto) {
			ModelMapper m = new ModelMapper();
			LoanType lt = m.map(o, LoanType.class);
			System.out.println("inside save of service loan type");
			// LoanType lt=(LoanType) o;
			ltr.save(lt);
		} 
//		else if (o instanceof StateMasterDto) {
//			ModelMapper m = new ModelMapper();
//			StateMaster st = m.map(o, StateMaster.class);
//			System.out.println("inside save of service state type");
//			sr.save(st);
//
//		} else if (o instanceof DistrictMasterDto) {
//			ModelMapper m = new ModelMapper();
//			DistrictMaster dm = m.map(o, DistrictMaster.class);
//			System.out.println("inside save of service district type");
//			dr.save(dm);
//
//		} 
		else if (o instanceof DealerMasterDto) {
			ModelMapper m = new ModelMapper();
			DealerMaster dm = m.map(o, DealerMaster.class);
			System.out.println("inside save of service dealer type");
			der.save(dm);

		} else if (o instanceof SubDealerMasterDto) {
			ModelMapper m = new ModelMapper();
			SubDealerMaster sdm = m.map(o, SubDealerMaster.class);
			System.out.println("inside save of service subdealer type");
			sder.save(sdm);

		} else if (o instanceof VendorDetailsDto) {
			ModelMapper m = new ModelMapper();
			VendorDetails vd = m.map(o, VendorDetails.class);
			System.out.println("inside save of service Vendor type");
			vr.save(vd);

		} else if (o instanceof BranchMasterDTO) {
			ModelMapper m = new ModelMapper();
			BranchMaster bm = m.map(o, BranchMaster.class);
			System.out.println("inside save of service subdealer type");
			br.save(bm);

		} 
//		else if (o instanceof BranchTypeMasterDto) {
//			ModelMapper m = new ModelMapper();
//			BranchTypeMaster btm = m.map(o, BranchTypeMaster.class);
//			System.out.println("inside save of service subdealer type");
//			btypr.save(btm);
//		} else if (o instanceof RoleMasterDto) {
//			ModelMapper m = new ModelMapper();
//			RoleMaster rm = m.map(o, RoleMaster.class);
//			System.out.println("inside save of service role");
//			rr.save(rm);
//		} 
		else if (o instanceof UserMasterDto) {
			ModelMapper m = new ModelMapper();
			UserMaster um = m.map(o, UserMaster.class);
			System.out.println("inside save of service user");
			ur.save(um);
		}  else if (o instanceof CustomerCibilDetailsDto) {
			ModelMapper m = new ModelMapper();
			CustomerCibilDetails ccd = m.map(o, CustomerCibilDetails.class);
			System.out.println("inside save of service CustomerCibiblDetails");
			ccdr.save(ccd);
		}  else if (o instanceof EnquiryDetailsDto) {
			ModelMapper m = new ModelMapper();
			EnquiryDetails ed = m.map(o, EnquiryDetails.class);
			System.out.println("inside save of service EnquiryDetails");
			edr.save(ed);
		}
	}

	@Override
	public List<StatusMasterDtoFetch> fetchStatusMaster() {
		System.out.println("inside Service");
		List<StatusMaster> l = (List<StatusMaster>) hri.findAll();
		System.out.println(l);
		System.out.println("hiiiii");
		ModelMapper m = new ModelMapper();
		List<StatusMasterDtoFetch> list = new ArrayList<StatusMasterDtoFetch>();
		for (StatusMaster object : l) {
			StatusMasterDtoFetch fetch = m.map(object, StatusMasterDtoFetch.class);
			list.add(fetch);
		}

//		List<StatusMasterDtoFetch> ls= (List<StatusMasterDtoFetch>) m.map(l, StatusMasterDtoFetch.class);
		return list;
	}

	@Override
	public List<BranchMasterDtoFetch> fetchBranchMaster() {
		System.out.println("inside Service");
		List<BranchMaster> l = (List<BranchMaster>) br.findAll();
		ModelMapper m = new ModelMapper();
		List<BranchMasterDtoFetch> list = new ArrayList<BranchMasterDtoFetch>();
		for (BranchMaster object : l) {
			BranchMasterDtoFetch fetch = m.map(object, BranchMasterDtoFetch.class);
			list.add(fetch);
		}

		return list;
	}

	@Override
	public List<BranchTypeMasterDtoFetch> fetchBranchTypeMaster() {
		System.out.println("inside Service");
		List<BranchTypeMaster> l = (List<BranchTypeMaster>) btypr.findAll();
		ModelMapper m = new ModelMapper();
		List<BranchTypeMasterDtoFetch> list = new ArrayList<BranchTypeMasterDtoFetch>();
		for (BranchTypeMaster object : l) {
			BranchTypeMasterDtoFetch fetch = m.map(object, BranchTypeMasterDtoFetch.class);
			list.add(fetch);
		}
		return list;
	}

	@Override
	public List<DealerMasterDtoFetch> fetchDealerMaster() {
		List<DealerMaster> l = (List<DealerMaster>) der.findAll();
		ModelMapper m = new ModelMapper();
		List<DealerMasterDtoFetch> list = new ArrayList<DealerMasterDtoFetch>();
		for (DealerMaster object : l) {
			DealerMasterDtoFetch fetch = m.map(object, DealerMasterDtoFetch.class);
			list.add(fetch);
		}
		return list;
	}

	@Override
	public List<DistrictMasterDtoFetch> fetchDistrictMaster() {
		List<DistrictMaster> l = (List<DistrictMaster>) dr.findAll();
		ModelMapper m = new ModelMapper();
		List<DistrictMasterDtoFetch> list = new ArrayList<DistrictMasterDtoFetch>();
		for (DistrictMaster object : l) {
			DistrictMasterDtoFetch fetch = m.map(object, DistrictMasterDtoFetch.class);
			list.add(fetch);
		}

		return list;
	}

	@Override
	public List<EnquiryStatusTraceDtoFetch> fetchEnquiryStatusTrace() {
		List<EnquiryStatusTrace> l=(List<EnquiryStatusTrace>) estr.findAll();
		ModelMapper m=new  ModelMapper();
		List<EnquiryStatusTraceDtoFetch> list=new ArrayList<EnquiryStatusTraceDtoFetch>();
		for(EnquiryStatusTrace object:l)
		{
			EnquiryStatusTraceDtoFetch fetch=m.map(object,EnquiryStatusTraceDtoFetch.class);
			list.add(fetch);
		}
	
		return list;
	}

	@Override
	public List<LoanTypeDtoFetch> fetchLoanType() {
		List<LoanType> l = (List<LoanType>) ltr.findAll();
		ModelMapper m = new ModelMapper();
		List<LoanTypeDtoFetch> list = new ArrayList<LoanTypeDtoFetch>();
		for (LoanType object : l) {
			LoanTypeDtoFetch fetch = m.map(object, LoanTypeDtoFetch.class);
			list.add(fetch);
		}
		return list;
	}

	@Override
	public List<StateMasterDtoFetch> fetchStateMaster() {
		List<StateMaster> l = (List<StateMaster>) sr.findAll();
		ModelMapper m = new ModelMapper();
		List<StateMasterDtoFetch> list = new ArrayList<StateMasterDtoFetch>();
		for (StateMaster object : l) {
			StateMasterDtoFetch fetch = m.map(object, StateMasterDtoFetch.class);
			list.add(fetch);
		}
		return list;
	}

	@Override
	public List<SubDealerMasterDtoFetch> fetchSubDealerMaster() {
		List<SubDealerMaster> l = (List<SubDealerMaster>) sder.findAll();
		ModelMapper m = new ModelMapper();
		List<SubDealerMasterDtoFetch> list = new ArrayList<SubDealerMasterDtoFetch>();
		for (SubDealerMaster object : l) {
			SubDealerMasterDtoFetch fetch = m.map(object, SubDealerMasterDtoFetch.class);
			list.add(fetch);
		}
		return list;
	}

	@Override
	public List<VenderDetailsDtoFetch> fetchVenderDetails() {
		List<VendorDetails> l = (List<VendorDetails>) vr.findAll();
		ModelMapper m = new ModelMapper();
		List<VenderDetailsDtoFetch> list = new ArrayList<VenderDetailsDtoFetch>();
		for (VendorDetails object : l) {
			VenderDetailsDtoFetch fetch = m.map(object, VenderDetailsDtoFetch.class);
			list.add(fetch);
		}
		return list;
	}

	@Override
	public List<RoleMasterDtoFetch> fetchRoleMaster() {
		List<RoleMaster> l = (List<RoleMaster>) rr.findAll();
		ModelMapper m = new ModelMapper();
		List<RoleMasterDtoFetch> list = new ArrayList<RoleMasterDtoFetch>();
		for (RoleMaster object : l) {
			RoleMasterDtoFetch fetch = m.map(object, RoleMasterDtoFetch.class);
			list.add(fetch);
		}
		return list;
	}

	@Override
	public List<UserMasterDtoFetch> fetchUserMaster() {
		List<UserMaster> l = (List<UserMaster>) ur.findAll();
		ModelMapper m = new ModelMapper();
		List<UserMasterDtoFetch> list = new ArrayList<UserMasterDtoFetch>();
		for (UserMaster object : l) {
			UserMasterDtoFetch fetch = m.map(object, UserMasterDtoFetch.class);
			list.add(fetch);
		}
		return list;
	}

	@Override
	public List<CustomerCibilDetailsDtoFetch> fetchCustomerCibilDetails() {
		List<CustomerCibilDetails> l = (List<CustomerCibilDetails>) ccdr.findAll();
		ModelMapper m = new ModelMapper();
		List<CustomerCibilDetailsDtoFetch> list = new ArrayList<CustomerCibilDetailsDtoFetch>();
		for (CustomerCibilDetails object : l) {
			CustomerCibilDetailsDtoFetch fetch = m.map(object, CustomerCibilDetailsDtoFetch.class);
			list.add(fetch);
		}
		return list;
	}

	@Override
	public List<EnquiryDetailsDtoFetch> fetchEnquiryDetails() {
		List<EnquiryDetails> l = (List<EnquiryDetails>) edr.findAll();
		ModelMapper m = new ModelMapper();
		List<EnquiryDetailsDtoFetch> list = new ArrayList<EnquiryDetailsDtoFetch>();
		for (EnquiryDetails object : l) {
			EnquiryDetailsDtoFetch fetch = m.map(object, EnquiryDetailsDtoFetch.class);
			list.add(fetch);
		}
		return list;
	}
}