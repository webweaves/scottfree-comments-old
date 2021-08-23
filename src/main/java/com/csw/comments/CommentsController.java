package com.csw.comments;

import java.util.List;
import static java.util.Arrays.asList;

public class CommentsController {

	public List<Comment> getComments() {
		return asList(new Comment(1L, "Test1"),
		new Comment(2L, "Test2"),
		new Comment(3L, "Test3"));
	}
}
