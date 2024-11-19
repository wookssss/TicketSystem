package com.itschool.ticket.service.base;

import com.itschool.ticket.ifs.CrudInterface;
import com.itschool.ticket.network.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.awt.print.Pageable;
import java.util.List;

@Component
public abstract class BaseService<Req, Res, Entity> implements CrudInterface<Req, Res> {
    @Autowired
    protected JpaRepository<Entity, Long> baseRepository;

    public abstract Header<List<Res>> getPaginationedList(Pageable pageable);

    protected abstract Res response(Entity entity);

}
