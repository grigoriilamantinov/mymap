package com.manatee.mymap.services;

import com.manatee.mymap.dto.FoundObject;

import java.util.List;

public interface Service {

    List<FoundObject> getSearchResult(String objectName);

    FoundObject getOneObject(String objectName, Long id);
}
