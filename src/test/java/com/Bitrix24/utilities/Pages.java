package com.Bitrix24.utilities;

import com.vytrack.pages.activites.CalendarEventsPage;
import com.vytrack.pages.dashboards.DashboardPage;
import com.vytrack.pages.dashboards.ManageDashboards;
import com.vytrack.pages.fleet.VehicleContract;
import com.vytrack.pages.fleet.VehiclesPage;
import com.vytrack.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private CalendarEventsPage calendarEventsPage;
    private DashboardPage dashboardPage;
    private ManageDashboards manageDashboards;
    private VehiclesPage vehiclesPage;
    private VehicleContract vehicleContract;

    public VehicleContract vehicleContract(){
        if(vehicleContract==null){
            vehicleContract = new VehicleContract();

        }
        return vehicleContract;
    }

    public VehiclesPage vehiclesPage() {
        if (vehiclesPage == null) {
            vehiclesPage = new VehiclesPage();
        }
        return vehiclesPage;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public CalendarEventsPage calendarEventsPage() {
        if (calendarEventsPage == null) {
            calendarEventsPage = new CalendarEventsPage();
        }
        return calendarEventsPage;
    }

    public DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }

    public ManageDashboards manageDashboards() {
        if (manageDashboards == null) {
            manageDashboards = new ManageDashboards();
        }
        return manageDashboards;
    }
}
