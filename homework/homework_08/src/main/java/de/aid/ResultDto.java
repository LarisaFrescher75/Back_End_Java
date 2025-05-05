package de.aid;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
@ToString
public class ResultDto {

    private List<TagDto> tags;

}
