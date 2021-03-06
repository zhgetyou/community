package cn.zh.community.dto;

import cn.zh.community.model.User;
import lombok.Data;

/**
 * @Author: zhanghuan
 * @Date: 2019/10/12 21:19
 * @Description: 数据传输层
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
