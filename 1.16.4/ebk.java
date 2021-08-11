/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ebk
/*    */ {
/* 21 */   public static final ebk a = new ebk();
/*    */   
/* 23 */   private final List<ebj> b = Lists.newArrayList();
/*    */   private final List<elo> c;
/*    */   
/*    */   private ebk() {
/* 27 */     this.c = Collections.emptyList();
/*    */   }
/*    */   
/*    */   public ebk(els ☃, ebf ebf1, Function<vk, ely> function, List<ebj> list) {
/* 31 */     this
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 37 */       .c = (List<elo>)list.stream().map(ebj1 -> { ely ely = ☃.apply(ebj1.a()); return (Function)(Objects.equals(ely, ebf1) ? null : els1.a(ebj1.a(), elp.a)); }).collect(Collectors.toList());
/* 38 */     Collections.reverse(this.c);
/*    */     
/* 40 */     for (int i = list.size() - 1; i >= 0; i--) {
/* 41 */       this.b.add(list.get(i));
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public elo a(elo ☃, bmb bmb1, @Nullable dwt dwt1, @Nullable aqm aqm1) {
/* 47 */     if (!this.b.isEmpty()) {
/* 48 */       for (int i = 0; i < this.b.size(); i++) {
/* 49 */         ebj ebj = this.b.get(i);
/* 50 */         if (ebj.a(bmb1, dwt1, aqm1)) {
/* 51 */           elo elo1 = this.c.get(i);
/* 52 */           if (elo1 == null) {
/* 53 */             return ☃;
/*    */           }
/* 55 */           return elo1;
/*    */         } 
/*    */       } 
/*    */     }
/*    */     
/* 60 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */