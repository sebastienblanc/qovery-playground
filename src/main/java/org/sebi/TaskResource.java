package org.sebi;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/tasks")
public class TaskResource {

    @GET
    public List<Task> tasks() {
        return Task.listAll();
    }

    @POST
    @Transactional
    public void createTask(Task task){
        task.persist();
    }
}