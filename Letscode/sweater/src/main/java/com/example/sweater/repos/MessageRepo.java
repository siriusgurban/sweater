package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Lenovo on 21.05.2020.
 */
public interface MessageRepo extends CrudRepository<Message, Integer> {
}
