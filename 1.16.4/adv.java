/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Consumer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class adv
/*     */   extends adt
/*     */ {
/*  26 */   private static final Logger c = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(Collection<boq<?>> ☃, aah aah1) {
/*  32 */     List<vk> list = Lists.newArrayList();
/*  33 */     int i = 0;
/*     */     
/*  35 */     for (boq<?> boq : ☃) {
/*  36 */       vk vk = boq.f();
/*  37 */       if (!this.a.contains(vk) && !boq.af_()) {
/*  38 */         a(vk);
/*  39 */         d(vk);
/*  40 */         list.add(vk);
/*  41 */         ac.f.a(aah1, boq);
/*  42 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/*  46 */     a(ql.a.b, aah1, list);
/*  47 */     return i;
/*     */   }
/*     */   
/*     */   public int b(Collection<boq<?>> ☃, aah aah1) {
/*  51 */     List<vk> list = Lists.newArrayList();
/*  52 */     int i = 0;
/*     */     
/*  54 */     for (boq<?> boq : ☃) {
/*  55 */       vk vk = boq.f();
/*  56 */       if (this.a.contains(vk)) {
/*  57 */         c(vk);
/*  58 */         list.add(vk);
/*  59 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/*  63 */     a(ql.a.c, aah1, list);
/*  64 */     return i;
/*     */   }
/*     */   
/*     */   private void a(ql.a ☃, aah aah1, List<vk> list) {
/*  68 */     aah1.b.a(new ql(☃, list, Collections.emptyList(), a()));
/*     */   }
/*     */   
/*     */   public md b() {
/*  72 */     md ☃ = new md();
/*     */     
/*  74 */     a().b(☃);
/*     */     
/*  76 */     mj mj1 = new mj();
/*  77 */     for (vk vk : this.a) {
/*  78 */       mj1.add(ms.a(vk.toString()));
/*     */     }
/*  80 */     ☃.a("recipes", mj1);
/*     */     
/*  82 */     mj mj2 = new mj();
/*  83 */     for (vk vk : this.b) {
/*  84 */       mj2.add(ms.a(vk.toString()));
/*     */     }
/*  86 */     ☃.a("toBeDisplayed", mj2);
/*     */     
/*  88 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(md ☃, bor bor1) {
/*  92 */     a(adu.a(☃));
/*     */     
/*  94 */     mj mj1 = ☃.d("recipes", 8);
/*  95 */     a(mj1, this::a, bor1);
/*     */     
/*  97 */     mj mj2 = ☃.d("toBeDisplayed", 8);
/*  98 */     a(mj2, this::f, bor1);
/*     */   }
/*     */   
/*     */   private void a(mj ☃, Consumer<boq<?>> consumer, bor bor1) {
/* 102 */     for (int i = 0; i < ☃.size(); i++) {
/* 103 */       String str = ☃.j(i);
/*     */       try {
/* 105 */         vk vk = new vk(str);
/* 106 */         Optional<? extends boq<?>> optional = bor1.a(vk);
/* 107 */         if (!optional.isPresent())
/* 108 */         { c.error("Tried to load unrecognized recipe: {} removed now.", vk); }
/*     */         else
/*     */         
/* 111 */         { consumer.accept(optional.get()); } 
/* 112 */       } catch (v v) {
/* 113 */         c.error("Tried to load improperly formatted recipe: {} removed now.", str);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aah ☃) {
/* 119 */     ☃.b.a(new ql(ql.a.a, this.a, this.b, a()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */