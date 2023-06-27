//package com.Crud.SpringbootApplication.Service.Employee;
//
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.Crud.SpringbootApplication.Model.Credential;
//import com.Crud.SpringbootApplication.Respository.CredentialRespository;
//
//@Service
//public  class CredentialServiceImpl implements CredentialService{
//	
//	@Autowired
//	private CredentialRespository credentialRespository;
//	@Override
//	public List<Credential> getAllCredential() {
//		// TODO Auto-generated method stub
//		return credentialRespository.findAll();
//	}
//
//	@Override
//	public void save(Credential credential) {
//		credentialRespository.save(credential);
//	}
//
//	@Override
//	public Credential getById(Long credential_id) {
//		Credential credential = null;
//		if (Objects.nonNull(credential_id)) {
//			Optional<Credential> optionalCredential = credentialRespository.findById(credential_id);
//			if(optionalCredential.isPresent()) {
//				credential = optionalCredential.get();
//			}else {
//				throw new RuntimeException("credential not found with the id:"+credential_id);
//			}
//		}
//		
//		return credential;
//	}
//
////	@Override
////	public void deleteById(Long id) {
////		if(Objects.nonNull(id));
////			credentialRespository.deleteById(id);
////		
////	}
//
//	@Override
//	public List<Credential> getCredentialByID(Credential credential) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Credential updateCredential(Credential credential) {
//		long credential_id = credential.getId();
//		Credential cre = credentialRespository.findById(credential_id).get();
//		cre.setUsername(credential.getUsername());
//		cre.setPassword(credential.getPassword());
//		
//		
//		
//		return credentialRespository.save(cre);
//	}
//
//	@Override
//	public Credential getById(Credential credential) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteById(Long credential_id) {
//		// TODO Auto-generated method stub
//		if(Objects.nonNull(credential_id));
//			credentialRespository.deleteById(credential_id);
//		
//	}
//	
//	
//
//}
