package com.wn.multiple.modules.common.controller;

import com.wn.multiple.framework.base.BaseController;
import com.wn.multiple.modules.common.service.ICommonService;
import com.wn.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController extends BaseController {

    @Autowired
    private ICommonService commonService;

    @PostMapping("/data")
    public R data() {
        commonService.total();
        return R.ok();
    }
}
