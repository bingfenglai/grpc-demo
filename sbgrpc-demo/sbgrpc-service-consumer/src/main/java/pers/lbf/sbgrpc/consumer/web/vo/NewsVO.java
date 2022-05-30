package pers.lbf.sbgrpc.consumer.web.vo;

import lombok.Data;

/**
 * @author ferryman
 * @since 2022/5/30 14:57
 */
@Data
public class NewsVO {

    Integer id;
    String title;
    String content;
    Long createTime;

}
