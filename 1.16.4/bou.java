/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bou
/*     */   extends boj
/*     */ {
/*     */   public bou(vk ☃) {
/*  19 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bio ☃, brx brx1) {
/*  24 */     List<bmb> list = Lists.newArrayList();
/*     */     
/*  26 */     for (int i = 0; i < ☃.Z_(); i++) {
/*  27 */       bmb bmb = ☃.a(i);
/*     */       
/*  29 */       if (!bmb.a()) {
/*  30 */         list.add(bmb);
/*     */         
/*  32 */         if (list.size() > 1) {
/*  33 */           bmb bmb1 = list.get(0);
/*  34 */           if (bmb.b() != bmb1.b() || bmb1.E() != 1 || bmb.E() != 1 || !bmb1.b().k()) {
/*  35 */             return false;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  41 */     return (list.size() == 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bio ☃) {
/*  46 */     List<bmb> list = Lists.newArrayList();
/*     */     
/*  48 */     for (int i = 0; i < ☃.Z_(); i++) {
/*  49 */       bmb bmb = ☃.a(i);
/*     */       
/*  51 */       if (!bmb.a()) {
/*  52 */         list.add(bmb);
/*     */         
/*  54 */         if (list.size() > 1) {
/*  55 */           bmb bmb1 = list.get(0);
/*  56 */           if (bmb.b() != bmb1.b() || bmb1.E() != 1 || bmb.E() != 1 || !bmb1.b().k()) {
/*  57 */             return bmb.b;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  63 */     if (list.size() == 2) {
/*  64 */       bmb bmb1 = list.get(0);
/*  65 */       bmb bmb2 = list.get(1);
/*     */       
/*  67 */       if (bmb1.b() == bmb2.b() && bmb1.E() == 1 && bmb2.E() == 1 && bmb1.b().k()) {
/*  68 */         blx blx = bmb1.b();
/*  69 */         int j = blx.j() - bmb1.g();
/*  70 */         int k = blx.j() - bmb2.g();
/*  71 */         int m = j + k + blx.j() * 5 / 100;
/*  72 */         int n = blx.j() - m;
/*  73 */         if (n < 0) {
/*  74 */           n = 0;
/*     */         }
/*     */         
/*  77 */         bmb bmb = new bmb(bmb1.b());
/*  78 */         bmb.b(n);
/*     */         
/*  80 */         Map<bps, Integer> map1 = Maps.newHashMap();
/*  81 */         Map<bps, Integer> map2 = bpu.a(bmb1);
/*  82 */         Map<bps, Integer> map3 = bpu.a(bmb2);
/*  83 */         gm.R.g().filter(bps::c).forEach(bps1 -> {
/*     */               int i = Math.max(((Integer)☃.getOrDefault(bps1, Integer.valueOf(0))).intValue(), ((Integer)map1.getOrDefault(bps1, Integer.valueOf(0))).intValue());
/*     */               
/*     */               if (i > 0) {
/*     */                 map.put(bps1, Integer.valueOf(i));
/*     */               }
/*     */             });
/*  90 */         if (!map1.isEmpty()) {
/*  91 */           bpu.a(map1, bmb);
/*     */         }
/*     */         
/*  94 */         return bmb;
/*     */       } 
/*     */     } 
/*     */     
/*  98 */     return bmb.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 103 */     return (☃ * i >= 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> ag_() {
/* 108 */     return bos.o;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bou.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */