package me.fevralev.recipesbook.services.impl;
import me.fevralev.recipesbook.services.CounterService;
import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService {
    private int counter;

    @Override
    public int getRequestCount() {
        return ++counter;
    }
}
