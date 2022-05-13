package com.codegym.dto;

public interface SeatTicketDto {
    Long getId();

    String getCode_seat();

    Boolean getDel_flag_seat();

    Integer getPosition_seat();

    Boolean getStatus_seat();

    Long getId_flight();

    Long getId_seat_type();
}
