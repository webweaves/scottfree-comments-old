package com.csw.comments;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("comments")
public class CommentsResource {

	@Inject
	CommentsController commentsController;

	@GET
	public List<Comment> getComments() {
		return commentsController.getComments();
	}
	
}
