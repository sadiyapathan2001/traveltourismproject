package com.anudip.travelAndTourismproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.anudip.travelAndTourismproject.entity.Accommodation;
import com.anudip.travelAndTourismproject.entity.Booking;
import com.anudip.travelAndTourismproject.entity.Destination;
import com.anudip.travelAndTourismproject.entity.Review;
import com.anudip.travelAndTourismproject.entity.Tourpackage;
import com.anudip.travelAndTourismproject.entity.Transportation;
import com.anudip.travelAndTourismproject.entity.User;

public class App {

    public static void main(String[] args) {
        // Create a configuration object and configure Hibernate
        Configuration configuration = new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Booking.class).addAnnotatedClass(Review.class).addAnnotatedClass(Tourpackage.class).addAnnotatedClass(Transportation.class).addAnnotatedClass(Accommodation.class).addAnnotatedClass(Destination.class);
   

        // Build the SessionFactory
        try (SessionFactory factory = configuration.buildSessionFactory()) {

            // Create a session
            try (Session session = factory.openSession()) {

                // Example usage of entities
                Transaction transaction = session.beginTransaction();

                // Create a user
                User user = new User();
                user.setUsername("john_doe");
                user.setPassword("password123");
                user.setEmail("john.doe@example.com");
                user.setRole("customer");
                session.save(user);

                // Create a destination
                Destination destination = new Destination();
                destination.setName("Paris");
                destination.setDescription("The city of love");
                session.save(destination);

                // Create a tour package
                Tourpackage tourPackage = new Tourpackage();
                tourPackage.setName("Romantic Getaway");
                tourPackage.setDescription("Explore the romantic atmosphere of Paris");
                tourPackage.setPrice(1500.0);
                tourPackage.setDuration(5);
                tourPackage.setAvailability(10);
                session.save(tourPackage);

                // Create a booking
                Booking booking = new Booking();
                booking.setCustomer(user);
                booking.setTourpackage(tourPackage);
                booking.setBookingDate(new java.util.Date());
                booking.setStatus("confirmed");
                session.save(booking);

                // Commit the transaction
                transaction.commit();

                System.out.println("Entities saved successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
