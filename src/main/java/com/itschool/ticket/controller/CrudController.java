package com.itschool.ticket.controller;

import com.itschool.ticket.ifs.CrudInterface;
import io.swagger.v3.oas.models.headers.Header;

public abstract class CrudController<Req, Res, Entity> implements CrudInterface<Req, Res> {

}
