package com.example.taskmanagement.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id
    private String id;

    private String title;
    private String description;
    private LocalDateTime dueDate;
    private boolean completed;

    private String userId; // owner reference
}
