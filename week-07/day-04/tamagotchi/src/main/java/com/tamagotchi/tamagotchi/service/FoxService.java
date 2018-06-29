package com.tamagotchi.tamagotchi.service;
import com.tamagotchi.tamagotchi.models.Fox;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class FoxService {

  private Map<String, Fox> foxes;

  public FoxService() {
    foxes = new HashMap<>();
  }

  public void login(String username) {
    if (foxes.get(username) == null) {
      foxes.put(username, new Fox(username));
    }
  }

  public Fox getFox(String username) {
    Fox fox = foxes.get(username);
    return fox;
  }
}