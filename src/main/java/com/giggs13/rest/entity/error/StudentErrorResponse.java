package com.giggs13.rest.entity.error;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StudentErrorResponse {

    private int status;
    private String message;
    private long timeStamp;
}
