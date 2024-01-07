package com.example.kafka.sample.member.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MemberConsumer {


    @KafkaListener(id="member.request" , topics = "member.request" )
    public void getNameById(@Payload MemberRequest memberRequest) {

    }
}
