package com.tedu.sp02.item.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.service.ItemService;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class ItemServiceImpl implements ItemService {
	
	@Override
	public List<Item> getItems(String orderId) {
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item(1,"aaa",5));
		list.add(new Item(2,"bbb",4));
		list.add(new Item(3,"ccc",3));
		list.add(new Item(4,"ddd",2));
		list.add(new Item(5,"eee",1));
		return list;
	}

	@Override
	public void decreaseNumbers(List<Item> list) {
		if (log.isInfoEnabled()) {
			for (Item item : list) {
				log.info("减少库存——"+item);
			}
		}

	}

}
