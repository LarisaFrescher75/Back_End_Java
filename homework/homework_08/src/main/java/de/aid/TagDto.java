package de.aid;

//{
//        "confidence": 56.472225189209,
//        "tag": {
//        "de": "Mann"
//        }

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;


@ToString
@NoArgsConstructor
@Getter
public class TagDto {

    private  double confidence;
    private Map<String,String> tag;
}
