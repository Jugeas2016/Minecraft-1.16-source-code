/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import it.unimi.dsi.fastutil.ints.IntListIterator;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class d
/*     */ {
/*     */   private int a;
/* 477 */   private final ahe.c[] b = new ahe.c[16];
/*     */   
/*     */   private final Dynamic<?> c;
/*     */   private final int d;
/*     */   private final int e;
/* 482 */   private final Int2ObjectMap<Dynamic<?>> f = (Int2ObjectMap<Dynamic<?>>)new Int2ObjectLinkedOpenHashMap(16);
/*     */   
/*     */   public d(Dynamic<?> ☃) {
/* 485 */     this.c = ☃;
/* 486 */     this.d = ☃.get("xPos").asInt(0) << 4;
/* 487 */     this.e = ☃.get("zPos").asInt(0) << 4;
/*     */     
/* 489 */     ☃.get("TileEntities").asStreamOpt().result().ifPresent(☃ -> ☃.forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 502 */     boolean bool = ☃.get("convertedFromAlphaFormat").asBoolean(false);
/*     */     
/* 504 */     ☃.get("Sections").asStreamOpt().result().ifPresent(☃ -> ☃.forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 512 */     for (ahe.c c1 : this.b) {
/* 513 */       if (c1 != null)
/*     */       {
/*     */ 
/*     */         
/* 517 */         for (ObjectIterator<Map.Entry<Integer, IntList>> objectIterator = ahe.c.a(c1).entrySet().iterator(); objectIterator.hasNext(); ) { IntListIterator<Integer> intListIterator; Map.Entry<Integer, IntList> entry = objectIterator.next();
/* 518 */           int i = c1.a << 12;
/* 519 */           switch (((Integer)entry.getKey()).intValue()) {
/*     */             case 2:
/* 521 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 522 */                 j |= i;
/*     */                 
/* 524 */                 Dynamic<?> dynamic = a(j);
/* 525 */                 if ("minecraft:grass_block".equals(ahe.a(dynamic))) {
/* 526 */                   String str = ahe.a(a(a(j, ahe.b.b)));
/* 527 */                   if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 528 */                     a(j, ahe.d());
/*     */                   }
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 3:
/* 535 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 536 */                 j |= i;
/*     */                 
/* 538 */                 Dynamic<?> dynamic = a(j);
/* 539 */                 if ("minecraft:podzol".equals(ahe.a(dynamic))) {
/* 540 */                   String str = ahe.a(a(a(j, ahe.b.b)));
/* 541 */                   if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 542 */                     a(j, ahe.e());
/*     */                   }
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 110:
/* 549 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 550 */                 j |= i;
/*     */                 
/* 552 */                 Dynamic<?> dynamic = a(j);
/* 553 */                 if ("minecraft:mycelium".equals(ahe.a(dynamic))) {
/* 554 */                   String str = ahe.a(a(a(j, ahe.b.b)));
/* 555 */                   if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 556 */                     a(j, ahe.f());
/*     */                   }
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 25:
/* 563 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 564 */                 j |= i;
/* 565 */                 Dynamic<?> dynamic = c(j);
/* 566 */                 if (dynamic != null) {
/* 567 */                   String str = Boolean.toString(dynamic.get("powered").asBoolean(false)) + (byte)Math.min(Math.max(dynamic.get("note").asInt(0), 0), 24);
/* 568 */                   a(j, (Dynamic)ahe.g().getOrDefault(str, ahe.g().get("false0")));
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 26:
/* 574 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 575 */                 j |= i;
/* 576 */                 Dynamic<?> dynamic1 = b(j);
/* 577 */                 Dynamic<?> dynamic2 = a(j);
/* 578 */                 if (dynamic1 != null) {
/* 579 */                   int k = dynamic1.get("color").asInt(0);
/* 580 */                   if (k != 14 && k >= 0 && k < 16) {
/* 581 */                     String str = ahe.a(dynamic2, "facing") + ahe.a(dynamic2, "occupied") + ahe.a(dynamic2, "part") + k;
/* 582 */                     if (ahe.h().containsKey(str)) {
/* 583 */                       a(j, (Dynamic)ahe.h().get(str));
/*     */                     }
/*     */                   } 
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 176:
/*     */             case 177:
/* 592 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 593 */                 j |= i;
/* 594 */                 Dynamic<?> dynamic1 = b(j);
/* 595 */                 Dynamic<?> dynamic2 = a(j);
/* 596 */                 if (dynamic1 != null) {
/* 597 */                   int k = dynamic1.get("Base").asInt(0);
/* 598 */                   if (k != 15 && k >= 0 && k < 16) {
/* 599 */                     String str = ahe.a(dynamic2, (((Integer)entry.getKey()).intValue() == 176) ? "rotation" : "facing") + "_" + k;
/* 600 */                     if (ahe.i().containsKey(str)) {
/* 601 */                       a(j, (Dynamic)ahe.i().get(str));
/*     */                     }
/*     */                   } 
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 86:
/* 609 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 610 */                 j |= i;
/*     */                 
/* 612 */                 Dynamic<?> dynamic = a(j);
/* 613 */                 if ("minecraft:carved_pumpkin".equals(ahe.a(dynamic))) {
/* 614 */                   String str = ahe.a(a(a(j, ahe.b.a)));
/* 615 */                   if ("minecraft:grass_block".equals(str) || "minecraft:dirt".equals(str)) {
/* 616 */                     a(j, ahe.j());
/*     */                   }
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 140:
/* 623 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 624 */                 j |= i;
/* 625 */                 Dynamic<?> dynamic = c(j);
/* 626 */                 if (dynamic != null) {
/* 627 */                   String str = dynamic.get("Item").asString("") + dynamic.get("Data").asInt(0);
/* 628 */                   a(j, (Dynamic)ahe.k().getOrDefault(str, ahe.k().get("minecraft:air0")));
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 144:
/* 634 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 635 */                 j |= i;
/* 636 */                 Dynamic<?> dynamic = b(j);
/* 637 */                 if (dynamic != null) {
/* 638 */                   String str3, str1 = String.valueOf(dynamic.get("SkullType").asInt(0));
/* 639 */                   String str2 = ahe.a(a(j), "facing");
/*     */                   
/* 641 */                   if ("up".equals(str2) || "down".equals(str2)) {
/* 642 */                     str3 = str1 + String.valueOf(dynamic.get("Rot").asInt(0));
/*     */                   } else {
/* 644 */                     str3 = str1 + str2;
/*     */                   } 
/*     */                   
/* 647 */                   dynamic.remove("SkullType");
/* 648 */                   dynamic.remove("facing");
/* 649 */                   dynamic.remove("Rot");
/*     */                   
/* 651 */                   a(j, (Dynamic)ahe.l().getOrDefault(str3, ahe.l().get("0north")));
/*     */                 }  }
/*     */             
/*     */             
/*     */             case 64:
/*     */             case 71:
/*     */             case 193:
/*     */             case 194:
/*     */             case 195:
/*     */             case 196:
/*     */             case 197:
/* 662 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 663 */                 j |= i;
/*     */                 
/* 665 */                 Dynamic<?> dynamic = a(j);
/* 666 */                 if (ahe.a(dynamic).endsWith("_door")) {
/* 667 */                   Dynamic<?> dynamic1 = a(j);
/* 668 */                   if ("lower".equals(ahe.a(dynamic1, "half"))) {
/* 669 */                     int k = a(j, ahe.b.b);
/* 670 */                     Dynamic<?> dynamic2 = a(k);
/* 671 */                     String str = ahe.a(dynamic1);
/* 672 */                     if (str.equals(ahe.a(dynamic2))) {
/* 673 */                       String str1 = ahe.a(dynamic1, "facing");
/* 674 */                       String str2 = ahe.a(dynamic1, "open");
/* 675 */                       String str3 = bool ? "left" : ahe.a(dynamic2, "hinge");
/* 676 */                       String str4 = bool ? "false" : ahe.a(dynamic2, "powered");
/* 677 */                       a(j, (Dynamic)ahe.m().get(str + str1 + "lower" + str3 + str2 + str4));
/* 678 */                       a(k, (Dynamic)ahe.m().get(str + str1 + "upper" + str3 + str2 + str4));
/*     */                     } 
/*     */                   } 
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 175:
/* 686 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 687 */                 j |= i;
/*     */                 
/* 689 */                 Dynamic<?> dynamic = a(j);
/* 690 */                 if ("upper".equals(ahe.a(dynamic, "half"))) {
/* 691 */                   Dynamic<?> dynamic1 = a(a(j, ahe.b.a));
/* 692 */                   String str = ahe.a(dynamic1);
/* 693 */                   if ("minecraft:sunflower".equals(str)) {
/* 694 */                     a(j, ahe.n()); continue;
/* 695 */                   }  if ("minecraft:lilac".equals(str)) {
/* 696 */                     a(j, ahe.o()); continue;
/* 697 */                   }  if ("minecraft:tall_grass".equals(str)) {
/* 698 */                     a(j, ahe.p()); continue;
/* 699 */                   }  if ("minecraft:large_fern".equals(str)) {
/* 700 */                     a(j, ahe.q()); continue;
/* 701 */                   }  if ("minecraft:rose_bush".equals(str)) {
/* 702 */                     a(j, ahe.r()); continue;
/* 703 */                   }  if ("minecraft:peony".equals(str)) {
/* 704 */                     a(j, ahe.s());
/*     */                   }
/*     */                 }  }
/*     */             
/*     */           }  }
/*     */       
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private Dynamic<?> b(int ☃) {
/* 717 */     return (Dynamic)this.f.get(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private Dynamic<?> c(int ☃) {
/* 722 */     return (Dynamic)this.f.remove(☃); } public static int a(int ☃, ahe.b b1) {
/*     */     int i;
/*     */     int j;
/*     */     int k;
/* 726 */     switch (ahe.null.a[b1.b().ordinal()]) {
/*     */       case 1:
/* 728 */         i = (☃ & 0xF) + b1.a().a();
/* 729 */         return (i < 0 || i > 15) ? -1 : (☃ & 0xFFFFFFF0 | i);
/*     */       case 2:
/* 731 */         j = (☃ >> 8) + b1.a().a();
/* 732 */         return (j < 0 || j > 255) ? -1 : (☃ & 0xFF | j << 8);
/*     */       case 3:
/* 734 */         k = (☃ >> 4 & 0xF) + b1.a().a();
/* 735 */         return (k < 0 || k > 15) ? -1 : (☃ & 0xFFFFFF0F | k << 4);
/*     */     } 
/* 737 */     return -1;
/*     */   }
/*     */   
/*     */   private void a(int ☃, Dynamic<?> dynamic) {
/* 741 */     if (☃ < 0 || ☃ > 65535) {
/*     */       return;
/*     */     }
/*     */     
/* 745 */     ahe.c c1 = d(☃);
/*     */     
/* 747 */     if (c1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 751 */     c1.a(☃ & 0xFFF, dynamic);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ahe.c d(int ☃) {
/* 756 */     int i = ☃ >> 12;
/* 757 */     return (i < this.b.length) ? this.b[i] : null;
/*     */   }
/*     */   
/*     */   public Dynamic<?> a(int ☃) {
/* 761 */     if (☃ < 0 || ☃ > 65535) {
/* 762 */       return ahe.a();
/*     */     }
/*     */     
/* 765 */     ahe.c c1 = d(☃);
/*     */     
/* 767 */     if (c1 == null) {
/* 768 */       return ahe.a();
/*     */     }
/*     */     
/* 771 */     return c1.a(☃ & 0xFFF);
/*     */   }
/*     */   
/*     */   public Dynamic<?> a() {
/* 775 */     Dynamic<?> ☃ = this.c;
/* 776 */     if (this.f.isEmpty()) {
/* 777 */       ☃ = ☃.remove("TileEntities");
/*     */     } else {
/* 779 */       ☃ = ☃.set("TileEntities", ☃.createList(this.f.values().stream()));
/*     */     } 
/*     */     
/* 782 */     Dynamic<?> dynamic1 = ☃.emptyMap();
/* 783 */     List<Dynamic<?>> list = Lists.newArrayList();
/* 784 */     for (ahe.c c1 : this.b) {
/* 785 */       if (c1 != null) {
/* 786 */         list.add(c1.a());
/* 787 */         dynamic1 = dynamic1.set(String.valueOf(c1.a), dynamic1.createIntList(Arrays.stream(ahe.c.b(c1).toIntArray())));
/*     */       } 
/*     */     } 
/*     */     
/* 791 */     Dynamic<?> dynamic2 = ☃.emptyMap();
/* 792 */     dynamic2 = dynamic2.set("Sides", dynamic2.createByte((byte)this.a));
/* 793 */     dynamic2 = dynamic2.set("Indices", dynamic1);
/* 794 */     return ☃.set("UpgradeData", dynamic2).set("Sections", dynamic2.createList(list.stream()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahe$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */