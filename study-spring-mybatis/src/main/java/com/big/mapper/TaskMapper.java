package com.big.mapper;

import com.big.pojo.Task;

import java.util.List;

/**
 * TODO
 *
 * @author Yin
 * @date 2024-10-10 10:36
 */
public interface TaskMapper {
    List<Task> getLimitTen();
}
