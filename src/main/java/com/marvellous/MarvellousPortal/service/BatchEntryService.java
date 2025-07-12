package com.marvellous.MarvellousPortal.service;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import com.marvellous.MarvellousPortal.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;

    //C
    //Post
    public void saveEntry(BatchEntry batchEntry){
        batchEntryRepository.save(batchEntry);
    }

    //R:Read
    //Get
    public List<BatchEntry> getAll(){
        return batchEntryRepository.findAll();
    }

    public Optional<BatchEntry> findById(ObjectId id){
        return batchEntryRepository.findById(id);
    }

    //D:Delete
    //Delete
    public void deleteById(ObjectId id){
        batchEntryRepository.deleteById(id);
    }

    //Update
    public BatchEntry updateEntry(BatchEntry batchEntry){
        return batchEntryRepository.save(batchEntry);
    }
}
