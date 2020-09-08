package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Agent;
import com.lambdaschool.javaorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentServicesImpl implements AgentServices {

    @Autowired
    private AgentsRepository agentRepos;

    @Override
    public Agent save(Agent agent) {
        return agentRepos.save(agent);
    }
}
