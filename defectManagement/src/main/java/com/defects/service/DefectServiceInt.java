package com.defects.service;

import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.defects.model.Comments;
import com.defects.model.Defects;
@Service
public interface DefectServiceInt {

	void updateDefectDetails(Defects defect);
    JSONObject findDefectByID(String defectID);
    List getAllDefects();
    void newDefect(Defects defect);
    void deleteDefect(String defectID);
    void addComment(Comments comment,String defectId);
	JSONObject findDefectHistoryByID(String defectID);
}
