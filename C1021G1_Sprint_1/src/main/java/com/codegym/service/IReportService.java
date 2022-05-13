package com.codegym.service;

import com.codegym.dto.IReport;
import com.codegym.dto.IReportAirlineType;
import com.codegym.dto.IReportEmployee;
import com.codegym.model.Ticket;
import java.util.List;

public interface IReportService {
    List<IReport> getAllReportPrice();
    List<IReportEmployee> getAllReportEmployee(Integer month);
    List<IReportAirlineType>  getAllAirlineType(String fromDate,String toDate);
}