package com.arturoo404.MinecraftPage.entity;

import com.arturoo404.MinecraftPage.entity.user.User;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "minecraft_player")
@Entity
public class MinecraftPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(
            name = "player_name",
            length = 50,
            nullable = false
    )
    private String playerName;
    @Column(
            name = "uuid",
            length = 60,
            unique = true,
            nullable = false
    )
    private String uuid;
    @Column(name = "player_online")
    private boolean playerOnline;
    @OneToOne(mappedBy = "minecraftPlayer")
    private User user;
}
