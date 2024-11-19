package com.itschool.ticket.ifs;
import com.itschool.ticket.network.Header;

public interface CrudInterface<Req, Res> {
    Header<Res> create(Header<Req> request);

    Header<Res> read(Header<Req> request);

    Header<Res> update(Long id, Header<Req> request);

    Header delete(Long id);

}
