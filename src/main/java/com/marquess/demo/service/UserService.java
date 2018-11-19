package com.marquess.demo.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.marquess.demo.dao.UserMapper;
import com.marquess.demo.model.User;
import com.marquess.demo.model.UserExample;
import com.marquess.demo.vo.BaseReturnVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public BaseReturnVO getUserList() {
        BaseReturnVO baseReturnVO = new BaseReturnVO();
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0);
        Page<User> page = PageHelper.startPage(1, 10);
        //page = (Page<User>)userMapper.selectByExample(example);
        userMapper.selectByExample(example);
        baseReturnVO.setResCode(0);
        baseReturnVO.setResCodeDes("OK");
        baseReturnVO.setResult(page);
        return baseReturnVO;
    }
}
