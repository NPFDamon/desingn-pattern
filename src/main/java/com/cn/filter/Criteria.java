package com.cn.filter;

import java.util.List;

public interface Criteria {
    List<Phone> filter(List<Phone> phones);
}
