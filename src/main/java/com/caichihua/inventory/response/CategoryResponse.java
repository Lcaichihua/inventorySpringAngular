package com.caichihua.inventory.response;

import com.caichihua.inventory.model.Category;
import lombok.Data;

import java.util.List;

@Data
public class CategoryResponse {
    private List<Category> category;
}
