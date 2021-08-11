/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Set;
/*     */ import java.util.function.UnaryOperator;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class dat
/*     */   extends dai
/*     */ {
/*  26 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final nr b;
/*     */   
/*     */   @Nullable
/*     */   private final cyv.c d;
/*     */   
/*     */   private dat(dbo[] ☃, @Nullable nr nr1, @Nullable cyv.c c1) {
/*  34 */     super(☃);
/*  35 */     this.b = nr1;
/*  36 */     this.d = c1;
/*     */   }
/*     */ 
/*     */   
/*     */   public dak b() {
/*  41 */     return dal.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<daz<?>> a() {
/*  46 */     return (this.d != null) ? (Set<daz<?>>)ImmutableSet.of(this.d.a()) : (Set<daz<?>>)ImmutableSet.of();
/*     */   }
/*     */   
/*     */   public static UnaryOperator<nr> a(cyv ☃, @Nullable cyv.c c1) {
/*  50 */     if (c1 != null) {
/*  51 */       aqa aqa = ☃.<aqa>c((daz)c1.a());
/*  52 */       if (aqa != null) {
/*     */ 
/*     */         
/*  55 */         db db = aqa.cw().a(2);
/*  56 */         return nr1 -> {
/*     */             try {
/*     */               return ns.a(☃, nr1, aqa1, 0);
/*  59 */             } catch (CommandSyntaxException commandSyntaxException) {
/*     */               a.warn("Failed to resolve text component", (Throwable)commandSyntaxException);
/*     */               return nr1;
/*     */             } 
/*     */           };
/*     */       } 
/*     */     } 
/*  66 */     return ☃ -> ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bmb ☃, cyv cyv1) {
/*  71 */     if (this.b != null) {
/*  72 */       ☃.a(a(cyv1, this.d).apply(this.b));
/*     */     }
/*  74 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a
/*     */     extends dai.c<dat>
/*     */   {
/*     */     public void a(JsonObject ☃, dat dat1, JsonSerializationContext jsonSerializationContext) {
/*  88 */       super.a(☃, dat1, jsonSerializationContext);
/*     */       
/*  90 */       if (dat.a(dat1) != null) {
/*  91 */         ☃.add("name", nr.a.b(dat.a(dat1)));
/*     */       }
/*     */       
/*  94 */       if (dat.b(dat1) != null) {
/*  95 */         ☃.add("entity", jsonSerializationContext.serialize(dat.b(dat1)));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public dat a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 101 */       nr nr = nr.a.a(☃.get("name"));
/* 102 */       cyv.c c1 = afd.<cyv.c>a(☃, "entity", null, jsonDeserializationContext, cyv.c.class);
/* 103 */       return new dat(arrayOfDbo, nr, c1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */