package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Subreddit {
    private Long id;
    @NotBlank(message ="Community name is required")
    private String name;
    @NotBlank(message ="Description is required")
    private String description;
    @OneToMany(fetch = LAZY)
    private List <Post> posts;
    private Instant createdDate;
    @ManyToOne(fetch = LAZY)
    private User user;

}
