package com.arturoo404.MinecraftPage.repository;

import com.arturoo404.MinecraftPage.entity.MinecraftPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<MinecraftPlayer, Long> {
}
