package com.arturoo404.MinecraftPage.repository;

import com.arturoo404.MinecraftPage.entity.minecraftplayer.MinecraftPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<MinecraftPlayer, Long> {
}
