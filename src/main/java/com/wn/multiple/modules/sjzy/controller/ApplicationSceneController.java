package com.wn.multiple.modules.sjzy.controller;

import com.wn.multiple.framework.base.BaseController;
import com.wn.multiple.modules.sjzy.model.ApplicationScene;
import com.wn.multiple.modules.sjzy.service.IApplicationSceneService;
import com.wn.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sjzy/scene")
public class ApplicationSceneController extends BaseController {

    @Autowired
    private IApplicationSceneService applicationSceneService;

    @PostMapping("/list")
    public R list(){
        List<ApplicationScene> result = applicationSceneService.selectList(null);
        return R.ok().put("data", result);
    }
}
