package com.bajiru.shoppingerp.controller;

import com.bajiru.shoppingerp.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description create buyer Controller
 * @AuthorName StevenWu
 * @CreateDateTime 2020-03-31-9:34 下午
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("list")
    public ResultVO list(){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

}
