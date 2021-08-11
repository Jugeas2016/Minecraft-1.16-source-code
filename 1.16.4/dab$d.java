/*     */ import com.google.common.collect.Iterables;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.List;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum d
/*     */ {
/* 149 */   a("replace")
/*     */   {
/*     */     public void a(mt ☃, dr.h h1, List<mt> list) throws CommandSyntaxException {
/* 152 */       h1.b(☃, (mt)Iterables.getLast(list)::c);
/*     */     }
/*     */   },
/* 155 */   b("append")
/*     */   {
/*     */     public void a(mt ☃, dr.h h1, List<mt> list) throws CommandSyntaxException {
/* 158 */       List<mt> list1 = h1.a(☃, mj::new);
/* 159 */       list1.forEach(mt1 -> {
/*     */             
/*     */             if (mt1 instanceof mj) {
/*     */               ☃.forEach(());
/*     */             }
/*     */           });
/*     */     }
/*     */   },
/* 167 */   c("merge")
/*     */   {
/*     */     public void a(mt ☃, dr.h h1, List<mt> list) throws CommandSyntaxException {
/* 170 */       List<mt> list1 = h1.a(☃, md::new);
/* 171 */       list1.forEach(mt1 -> {
/*     */             if (mt1 instanceof md) {
/*     */               ☃.forEach(());
/*     */             }
/*     */           });
/*     */     }
/*     */   };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String d;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   d(String ☃) {
/* 189 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public static d a(String ☃) {
/* 193 */     for (d d1 : values()) {
/* 194 */       if (d1.d.equals(☃)) {
/* 195 */         return d1;
/*     */       }
/*     */     } 
/* 198 */     throw new IllegalArgumentException("Invalid merge strategy" + ☃);
/*     */   }
/*     */   
/*     */   public abstract void a(mt parammt, dr.h paramh, List<mt> paramList) throws CommandSyntaxException;
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dab$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */