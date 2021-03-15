package com.koray.platform.repo.repo;

import com.koray.platform.bean.po.ModelPo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository  extends JpaRepository<ModelPo, Long> {

    ModelPo findByTagId(Long tagId);
}
