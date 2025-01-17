package com.server.back.domain.stock.repository;

import com.server.back.domain.stock.entity.UserDealEntity;
import com.server.back.domain.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import java.util.Optional;
import java.util.Set;

public interface UserDealRepository extends JpaRepository<UserDealEntity, Long> {

    Optional<UserDealEntity> findByUserIdAndStockId(Long userId, Long stockId);

    List<UserDealEntity>findAllByUserAndStockMarketId(UserEntity user, Long marketId);

    List<UserDealEntity> findAllByUserId(Long userId);

    List<UserDealEntity> findAllByStockId(Long stockId);
}