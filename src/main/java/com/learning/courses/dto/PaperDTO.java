package com.learning.courses.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@Getter
@Setter

public class PaperDTO {

    private String title;

    private String type;

    private String additionalAuthors;

    private String isbn;

    private String topic;

}
