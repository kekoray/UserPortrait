package com.koray.platform.service.service;



import com.koray.platform.bean.dto.ModelDto;
import com.koray.platform.bean.dto.TagDto;
import com.koray.platform.bean.dto.TagModelDto;

import java.util.List;

public interface TagService {
    public void saveTags(List<TagDto> tags);

    List<TagDto> findByPid(Long pid);

    List<TagDto> findByLevel(Integer level);

    void addTagModel(TagDto tag, ModelDto model);

    List<TagModelDto> findModelByPid(Long pid);

    void addDataTag(TagDto tagDto);

    void updateModelState(Long id, Integer state);
}
