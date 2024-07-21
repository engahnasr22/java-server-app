package com.smartweb.server.repositories;

import com.smartweb.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
     default Server findByIpAddress(String ipAddress) {
         return null;
     }

}
