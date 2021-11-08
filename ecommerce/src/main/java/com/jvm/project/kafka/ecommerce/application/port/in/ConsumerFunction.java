package com.jvm.project.kafka.ecommerce.application.port.in;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import com.jvm.project.kafka.ecommerce.domain.Message;

public interface ConsumerFunction<T> {
    void consume(ConsumerRecord<String, Message<T>> record) throws Exception;
}