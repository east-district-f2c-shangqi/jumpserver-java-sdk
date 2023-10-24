package com.jumpserver.sdk.v2.jumpserver.tickets;

import com.jumpserver.sdk.v2.common.BaseJmsService;
import com.jumpserver.sdk.v2.common.ClientConstants;
import com.jumpserver.sdk.v2.model.Tickets;

import java.util.List;

public class TicketsServiceImpl extends BaseJmsService implements TicketsService {
    @Override
    public List<Tickets> ticketsList() {
        return get(Tickets.class, uri(ClientConstants.TICKETS)).executeList();
    }
}
