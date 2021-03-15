package com.koray.platform.service.service;


import com.koray.platform.bean.dto.ModelDto;

public interface Engine {

    void startModel(ModelDto modelDto);
    void stopModel(ModelDto modelDto);
}
