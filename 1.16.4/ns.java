/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ns
/*     */ {
/*     */   public static nx a(nx ☃, ob ob1) {
/*  18 */     if (ob1.g()) {
/*  19 */       return ☃;
/*     */     }
/*     */     
/*  22 */     ob ob2 = ☃.c();
/*  23 */     if (ob2.g()) {
/*  24 */       return ☃.a(ob1);
/*     */     }
/*     */     
/*  27 */     if (ob2.equals(ob1)) {
/*  28 */       return ☃;
/*     */     }
/*     */     
/*  31 */     return ☃.a(ob2.a(ob1));
/*     */   }
/*     */   
/*     */   public static nx a(@Nullable db ☃, nr nr1, @Nullable aqa aqa1, int i) throws CommandSyntaxException {
/*  35 */     if (i > 100) {
/*  36 */       return nr1.e();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  41 */     nx nx = (nr1 instanceof nt) ? ((nt)nr1).a(☃, aqa1, i + 1) : nr1.g();
/*     */     
/*  43 */     for (nr nr2 : nr1.b()) {
/*  44 */       nx.a(a(☃, nr2, aqa1, i + 1));
/*     */     }
/*     */     
/*  47 */     return nx.c(a(☃, nr1.c(), aqa1, i));
/*     */   }
/*     */   
/*     */   private static ob a(@Nullable db ☃, ob ob1, @Nullable aqa aqa1, int i) throws CommandSyntaxException {
/*  51 */     nv nv = ob1.i();
/*  52 */     if (nv != null) {
/*  53 */       nr nr = nv.<nr>a(nv.a.a);
/*  54 */       if (nr != null) {
/*  55 */         nv nv1 = new nv((nv.a)nv.a.a, (T)a(☃, nr, aqa1, i + 1));
/*  56 */         return ob1.a(nv1);
/*     */       } 
/*     */     } 
/*     */     
/*  60 */     return ob1;
/*     */   }
/*     */   
/*     */   public static nr a(GameProfile ☃) {
/*  64 */     if (☃.getName() != null)
/*  65 */       return new oe(☃.getName()); 
/*  66 */     if (☃.getId() != null) {
/*  67 */       return new oe(☃.getId().toString());
/*     */     }
/*  69 */     return new oe("(unknown)");
/*     */   }
/*     */ 
/*     */   
/*     */   public static nr a(Collection<String> ☃) {
/*  74 */     return a(☃, ☃ -> (new oe(☃)).a(k.k));
/*     */   }
/*     */   
/*     */   public static <T extends Comparable<T>> nr a(Collection<T> ☃, Function<T, nr> function) {
/*  78 */     if (☃.isEmpty())
/*  79 */       return oe.d; 
/*  80 */     if (☃.size() == 1) {
/*  81 */       return function.apply(☃.iterator().next());
/*     */     }
/*     */     
/*  84 */     List<T> list = Lists.newArrayList(☃);
/*  85 */     list.sort(Comparable::compareTo);
/*  86 */     return b(list, function);
/*     */   }
/*     */   
/*     */   public static <T> nx b(Collection<T> ☃, Function<T, nr> function) {
/*  90 */     if (☃.isEmpty())
/*  91 */       return new oe(""); 
/*  92 */     if (☃.size() == 1) {
/*  93 */       return ((nr)function.apply(☃.iterator().next())).e();
/*     */     }
/*     */     
/*  96 */     nx nx = new oe("");
/*  97 */     boolean bool = true;
/*  98 */     for (T t : ☃) {
/*  99 */       if (!bool) {
/* 100 */         nx.a((new oe(", ")).a(k.h));
/*     */       }
/* 102 */       nx.a(function.apply(t));
/* 103 */       bool = false;
/*     */     } 
/*     */     
/* 106 */     return nx;
/*     */   }
/*     */   
/*     */   public static nx a(nr ☃) {
/* 110 */     return new of("chat.square_brackets", new Object[] { ☃ });
/*     */   }
/*     */   
/*     */   public static nr a(Message ☃) {
/* 114 */     if (☃ instanceof nr) {
/* 115 */       return (nr)☃;
/*     */     }
/* 117 */     return new oe(☃.getString());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ns.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */