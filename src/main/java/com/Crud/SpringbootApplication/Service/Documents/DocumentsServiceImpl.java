package com.Crud.SpringbootApplication.Service.Documents;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crud.SpringbootApplication.Model.Documents;
import com.Crud.SpringbootApplication.Respository.DocumentsRespository;

@Service
public class DocumentsServiceImpl implements DocumentsService{
	
	@Autowired
	private DocumentsRespository documentsRespository;
	@Override
	public List<Documents> getAllDocuments() {
		// TODO Auto-generated method stub
		return documentsRespository.findAll();
	}

	@Override
	public void save(Documents documents) {
		documentsRespository.save(documents);
	}
	
	@Override
	public Documents getById(Long document_id) {
		Documents documents = null;
		if (Objects.nonNull(document_id)) {
			Optional<Documents> optionalDocuments = documentsRespository.findById(document_id);
			if(optionalDocuments.isPresent()) {
				documents = optionalDocuments.get();
			}else {
				throw new RuntimeException("Documents not found with the id:"+document_id);
			}
		}
		
		return documents;
	}

	@Override
	public void deleteById(Long document_id) {
		if(Objects.nonNull(document_id));
		documentsRespository.deleteById(document_id);
		
	}

	@Override
	public List<Documents> getDocumentsByID(Documents documents) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Documents updateDocuments(Documents documents) {
		long document_id = documents.getDocument_id();
		Documents doc = documentsRespository.findById(document_id).get();
		doc.setEmploy_Doc(documents.getEmploy_Doc());
		doc.setContractor_Info(documents.getContractor_Info());
		doc.setMie_Consent_Forum(documents.getMie_Consent_Forum());
		doc.setEmploy_id(documents.getEmploy_id());
		
		return documentsRespository.save(doc);
	}

	@Override
	public Documents getById(Documents documents) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
